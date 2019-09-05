package ru.vadimka.nfswlauncher.theme;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ru.vadimka.nfswlauncher.Config;
import ru.vadimka.nfswlauncher.Main;

public class InfoDialog {
	
	public static final String DESIGN_VERSION = "1.0";

	public InfoDialog() {}
	
	public void show() {
		JOptionPane.showMessageDialog((JFrame) Main.frame, getLocalizedMessage(),getLocalizedTitle(),JOptionPane.INFORMATION_MESSAGE,null);
	}
	
	private String getLocalizedMessage() {
		switch(Main.locale.getID()) {
		case "ru":
			return "Версия лаунчера: "+Config.VERSION+"\n"+
			"Версия дизайна: "+DESIGN_VERSION+"\n"+
			"Разработчик лаунчера: Vadimka - vadik.golubeff@yandex.ru\n"+
			"Автор дизайна: Ryan Cooper - Discord: Ryan Cooper (Cooperyan)#9057\n"+
			"Что изменилось в этой версии:\n"+
			"- Разработан дизайн (и да, покачто в таком ужасном качестве xD)\n"+
			"- Добавлена проверка целостности клиента\n"+
			"- Добавлена интеграция Discord\n"+
			"- Обновлена система логгирования\n"+
			"- Оптимизация лаунчера\n"+
			"- Изменен способ хранения аккаунта\n"+
			"- Изменен способ хранения последнего сервера\n"+
			"- Добавлена поддержка серверов с HTTPS";
		default:
			return "Launcher version: "+Config.VERSION+"\n"+
			"Design version: "+DESIGN_VERSION+"\n"+
			"Launcher developer: Vadimka - vadik.golubeff@yandex.ru\n"+
			"Design author: Ryan Cooper - Discord: Ryan Cooper (Cooperyan)#9057\n"+
			"What has changed in this version:\n"+
			"- Design developed\n"+
			"- Added client integrity check\n"+
			"- Discord integration added\n"+
			"- Updated logging system\n"+
			"- Launcher Optimization\n"+
			"- Changed account storage method\n"+
			"- Changed the storage method of the last server\n"+
			"- Added support for servers with HTTPS";
		}
	}
	
	private String getLocalizedTitle() {
		switch(Main.locale.getID()) {
		case "ru":
			return "О лаунчере";
		default:
			return "About launcher";
		}
	}

}
