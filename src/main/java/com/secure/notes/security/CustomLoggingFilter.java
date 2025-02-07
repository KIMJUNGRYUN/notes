package com.secure.notes.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;

@Component //클래스 전체를 시큐리티가 관리하게
public class CustomLoggingFilter extends OncePerRequestFilter { //UseEffect 랑 비슷

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        System.out.println("CustomLoggingFilter - Request URI: " + request.getRequestURI());
        filterChain.doFilter(request, response); //위쪽 코드는 요청(Request) 아래쪽 코드는 응답(Response)
        System.out.println("CustomLoggingFilter - Response Status: " + response.getStatus());
    }
}