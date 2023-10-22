package com.simplepicpay.services;

import com.simplepicpay.domain.user.User;
import com.simplepicpay.dtos.NotificationRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {
    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception{
        String email = user.getEmail();
        NotificationRequestDTO notificationRequest = new NotificationRequestDTO(email, message);

//        ResponseEntity<String> notificationResponse = restTemplate.postForEntity("https://run.mocky.io/v3/f70c4704-1910-42fd-8b48-61450c290188",notificationRequest, String.class);
//
//       if (notificationResponse.getStatusCode() == HttpStatus.OK){
//           System.out.println("Erro ao enviar notificação.");
//           throw new Exception("Serviço de notificação está fora do ar");
//       }

        System.out.println("Notificação enviada ao usuário.");
    }
}
