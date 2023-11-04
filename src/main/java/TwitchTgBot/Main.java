package TwitchTgBot;

import com.github.philippheuer.credentialmanager.domain.OAuth2Credential;
import com.github.twitch4j.TwitchClient;
import com.github.twitch4j.TwitchClientBuilder;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static TwitchClient twitchClient;

    public static void main(String[] args) {
        try {
            twitchClient = TwitchClientBuilder.builder()
                    .withEnableHelix(true)
                    .withEnableChat(true)
                    // Получить токен можно тут: (скоупы выбираем по нужде - для сообщений в чате достаточно Bot Chat Token: https://twitchtokengenerator.com/, вставляем во второй параметр ниже строку из Access Token)
                    .withChatAccount(new OAuth2Credential("twitch", "szsbd0xax60hi2x5pcq5er8k091gsq"))
                    .withDefaultAuthToken(new OAuth2Credential("twitch", "szsbd0xax60hi2x5pcq5er8k091gsq"))
                    .build();

            twitchClient.getChat().joinChannel("binoclaa");
            twitchClient.getChat().sendMessage("binoclaa", "Hello World!");
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new TelegramBot());
        } catch (TelegramApiException e) {
            System.out.println("Не получилось проинициализировать телеграм бота");
        }
    }
}
