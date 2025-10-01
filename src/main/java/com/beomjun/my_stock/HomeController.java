package com.beomjun.my_stock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>My Stock Application</title>
                <style>
                    body { font-family: Arial, sans-serif; margin: 40px; }
                    .container { max-width: 600px; margin: 0 auto; }
                    h1 { color: #333; }
                    .info { background: #f0f8ff; padding: 20px; border-radius: 5px; margin: 20px 0; }
                    .links { margin: 20px 0; }
                    .links a { display: inline-block; margin: 10px 15px 10px 0; padding: 10px 20px; 
                              background: #007bff; color: white; text-decoration: none; border-radius: 5px; }
                    .links a:hover { background: #0056b3; }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>🚀 My Stock Application</h1>
                    
                    <div class="info">
                        <h3>✅ 애플리케이션이 성공적으로 실행 중입니다!</h3>
                        <p>Spring Boot 애플리케이션이 Kubernetes에서 정상적으로 동작하고 있습니다.</p>
                    </div>
                    
                    <div class="links">
                        <h3>🔗 유용한 링크들:</h3>
                        <a href="/h2-console" target="_blank">H2 데이터베이스 콘솔</a>
                        <a href="/actuator/health" target="_blank">헬스 체크</a>
                        <a href="/actuator/info" target="_blank">애플리케이션 정보</a>
                    </div>
                    
                    <div class="info">
                        <h3>📊 시스템 정보:</h3>
                        <p><strong>애플리케이션:</strong> My Stock Application</p>
                        <p><strong>버전:</strong> 0.0.1-SNAPSHOT</p>
                        <p><strong>프레임워크:</strong> Spring Boot 3.5.5</p>
                        <p><strong>데이터베이스:</strong> H2 In-Memory</p>
                        <p><strong>배포 환경:</strong> Kubernetes + ArgoCD</p>
                    </div>
                </div>
            </body>
            </html>
            """;
    }

    @GetMapping("/api/status")
    @ResponseBody
    public String status() {
        return """
            {
                "status": "UP",
                "application": "My Stock Application",
                "version": "0.0.1-SNAPSHOT",
                "timestamp": "%s"
            }
            """.formatted(java.time.Instant.now());
    }
}
