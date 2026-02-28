package com.cognitask.cognitask_ai.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtil {

    // 🔐 Secret key (minimum 32 characters required for HS256)
    private final Key key = Keys.hmacShaKeyFor(
            "myveryveryveryveryveryverylongsecretkey12345".getBytes()
    );

    // ✅ Generate Token
    public String generateToken(String email, String role) {

        Map<String, Object> claims = new HashMap<>();
        claims.put("role", role);

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(email)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public String extractRole(String token) {
        return extractAllClaims(token).get("role", String.class);
    }

    // ✅ Extract Username (email)
    public String extractUsername(String token) {
        return extractAllClaims(token).getSubject();
    }

    // ✅ Extract Expiration Date
    public Date extractExpiration(String token) {
        return extractAllClaims(token).getExpiration();
    }

    // ✅ Extract All Claims (IMPORTANT FIXED METHOD)
    private Claims extractAllClaims(String token) {

        return Jwts.parserBuilder()
                .setSigningKey(key) // use SAME key used for signing
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    // ✅ Check if Token Expired
    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    // ✅ Validate Token
    public Boolean validateToken(String token, String email) {

        final String extractedEmail = extractUsername(token);

        return (extractedEmail.equals(email) && !isTokenExpired(token));
    }
}