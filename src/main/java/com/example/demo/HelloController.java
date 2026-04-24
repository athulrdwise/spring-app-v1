package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return """
                <html>
                    <body style='display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; font-family: sans-serif; background-color: #f0f2f5;'>
                        <div style='text-align: center; padding: 40px; background: white; border-radius: 15px; shadow: 0 4px 6px rgba(0,0,0,0.1); border: 1px solid #e1e4e8;'>
                            <h1 style='color: #2c3e50; margin-bottom: 10px;'>Hello Master..!!</h1>
                            <p style='color: #7f8c8d; font-size: 1.2rem;'>This is <span style='color: rgb(219, 52, 52); font-weight: bold;'>Version 10.0.13</span></p>
                        </div>
                    </body>
                </html>
                """;

    }
}