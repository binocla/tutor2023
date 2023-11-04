package TwitchTgBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Random;

public class TelegramBot extends TelegramLongPollingBot {

    private int cnt = 0;

    @Override
    public void onUpdateReceived(Update update) {

        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString()); // chatId -- кому отправить
            System.out.println("Сообщение: " + update.getMessage().getText());
            if (update.getMessage().getText().equals("/start")) {
                cnt = cnt + 1;
                message.setText("/start уже нажали " + cnt + " раз"); // текст сообщения
            } else if (update.getMessage().getText().equals("/random")) {
                message.setText("Случайное число для тебя: " + new Random().nextInt(1000)); // текст сообщения
            }
            Main.twitchClient.getChat().sendMessage("binoclaa", update.getMessage().getText());

            // try catch конструкция позволяет обрабатывать исключения в Java
            // Есть ряд исключений, например, TelegramApiException
            // нам важно выполнять код ниже в try catch блоке, чтобы в случае "ошибки" TelegramApiException мы могли определить запасное (резервное) поведение
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                System.out.println("Что-то пошло не так");
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "TestBinoclaTutorBot";
    }

    @Override
    public String getBotToken() {
        return "6948587246:AAE-7u5qjLYXp9282J5xxb68l50vTqOs7iw";
    }
}
