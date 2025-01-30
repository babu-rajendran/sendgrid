package dev.babu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var emailService = new EmailService();
        var body = """
                Hello, from SendGrid!
                
                I am testing out the Java SDK fro SendGrid and this is a multiline string in Java.
                
                Thanks,
                Babu
                """;

        try {
            emailService.sendEmail(
                    "babu_rajendran@outlook.com",
                    "SendGrid Demo",
                    body);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}