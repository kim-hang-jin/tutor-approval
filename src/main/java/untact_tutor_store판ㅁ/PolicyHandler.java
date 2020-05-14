package untact_tutor_store판ㅁ;

import untact_tutor_store판ㅁ.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverSalesRequested_SalesApprovalRequest(@Payload SalesRequested salesRequested){

        if(salesRequested.isMe()){
            System.out.println("##### listener SalesApprovalRequest : " + salesRequested.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverRequestToCancelSales_RequestToCancelSales(@Payload RequestToCancelSales requestToCancelSales){

        if(requestToCancelSales.isMe()){
            System.out.println("##### listener RequestToCancelSales : " + requestToCancelSales.toJson());
        }
    }

}
