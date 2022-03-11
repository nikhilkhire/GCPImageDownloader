package com.googlecloudbucket.gcpimagedownloader.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.googlecloudbucket.gcpimagedownloader.config.MessagingConfig;

/**
 * This class used to download the message from rabbitmq which is
 * nothing but the google cloud url where the image is stored.
 */
@Component
public class ImageDownloader{

    /**
     * This method continuesly listen the queue.
     * 
     * @param cloudImageURL
     */
    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(final String cloudImageURL){
        System.out.println("Message received from queue : " + cloudImageURL);
    }
}