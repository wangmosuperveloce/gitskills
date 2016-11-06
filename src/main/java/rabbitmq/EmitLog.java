package rabbitmq;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Channel;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by wangmo on 16/9/5.
 */
public class EmitLog {

    private static final String EXCHANGE_NAME = "logs";

    public static void main(String []argv) throws IOException, TimeoutException{

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
//        factory.setPort(15672);
//        factory.setUsername("guest");
//        factory.setPassword("guest");

        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

        String message = getMessage(argv); // TODO

        channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes());

        System.out.println(" [x] Sent '" + message + "'");

        channel.close();
        connection.close();
    }

    private static String getMessage(String[] strings){
        if(strings.length < 1){
            return "info: hello world!";
        }
        return joinStrings(strings, " ");
    }

    private static String joinStrings(String[] strings, String delimiter){
        int length =  strings.length;
        if (length == 0) return "";
        StringBuilder words = new StringBuilder(strings[0]);
        for(int i=1; i < strings.length; i++){
            words.append(delimiter).append(strings[i]);
        }
        return words.toString();
    }

}
