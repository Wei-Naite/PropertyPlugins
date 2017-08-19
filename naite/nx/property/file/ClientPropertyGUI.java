package nx.property.file;

import java.io.File;

import nx.property.core.Core;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ClientPropertyGUI{

	public static YamlConfiguration yaml = null;
	public static File file = null;

	// reload
	public static void reloadPropertyGUI(){
		if(file == null){
			file = new File(Core.plugin.getDataFolder() + File.separator + "Interface" + File.separator + "propertygui.yml");
		}
		yaml = LanguageFileManager.loadFile(file, "Interface/propertygui.yml");
	}

	// getConfig
	public static FileConfiguration getPropertyGUI(){
		if(yaml == null){
			reloadPropertyGUI();
		}
		return yaml;
	}

	// save
	public static void savePropertyGUI(){
		if((yaml == null) || (file == null)){
			return;
		}
		LanguageFileManager.saveFile(file, yaml);
	}
}
