package nx.multisystem.config;


import nx.multisystem.NcMultiSystem;
import org.bukkit.configuration.file.FileConfiguration;

/**
 * Created by User on 2017/7/9.
 */
public class PropertySettings{

	private static FileConfiguration config;

	public static void reload(){
		NcMultiSystem.plugin.reloadConfig();
		config = NcMultiSystem.plugin.getConfig();
	}

	public static int getMaxExp(int level){
		return (int) Math.pow(level * getMaxExpDefault(), getMaxExpFloat());
	}

	public static int getMaxLevel(){
		return config.getInt("Player.MaxLevel");
	}

	public static int getMaxExpDefault(){
		return config.getInt("Player.MaxExp.Default");
	}

	public static double getMaxExpFloat(){
		return config.getDouble("Player.MaxExp.Float");
	}

	public static int getDefaultMaxHealth(){
		return config.getInt("Player.Ability.Health.DefaultMax");
	}

	public static int getDefaultRestoreHealth(){
		return config.getInt("Player.Ability.Health.DefaultRestore");
	}

	public static long getHealthRestoreTime(){
		return config.getLong("Player.Ability.Health.RestoreTime");
	}

	public static int getDefaultMaxMentality(){
		return config.getInt("Player.Ability.Mentality.DefaultMax");
	}

	public static int getDefaultRestoreMentality(){
		return config.getInt("Player.Ability.Mentality.DefaultRestore");
	}

	public static long getMentalityRestoreTime(){
		return config.getLong("Player.Ability.Mentality.RestoreTime");
	}

	public static long getMentalityDecreaseTime(){
		return config.getLong("Player.Ability.Mentality.DecreaseTime");
	}

	public static int getMentalityDecrease(){
		return config.getInt("Player.Ability.Mentality.Decrease");
	}

	public static int getDefaultMaxVitality(){
		return config.getInt("Player.Ability.Vitality.DefaultMax");
	}

	public static int getDefaultRestoreVitality(){
		return config.getInt("Player.Ability.Vitality.DefaultRestore");
	}

	public static long getVitalityRestoreTime(){
		return config.getLong("Player.Ability.Vitality.RestoreTime");
	}

	public static int getVitalityDecreaseWalkDistance(){
		return config.getInt("Player.Ability.Vitality.DecreaseWalkDistance");
	}

	public static int getVitalityDecrease(){
		return config.getInt("Player.Ability.Vitality.Decrease");
	}

	public static int getDefaultAtk(){
		return config.getInt("Player.Ability.DefaultATK");
	}

	public static int getDefaultDef(){
		return config.getInt("Player.Ability.DefaultDEF");
	}

	public static double getDefaultAar(){
		return config.getDouble("Player.Ability.DefaultAAR");
	}

	public static double getDefaultAkb(){
		return config.getDouble("Player.Ability.DefaultAKB");
	}

	public static double getDefaultAhit(){
		return config.getDouble("Player.Ability.DefaultAHIT");
	}

	public static int getMaxStr(){
		return config.getInt("Player.AttributeMax.STR");
	}

	public static int getMaxInt(){
		return config.getInt("Player.AttributeMax.INT");
	}

	public static int getMaxAgi(){
		return config.getInt("Player.AttributeMax.AGI");
	}

	public static int getMaxLuk(){
		return config.getInt("Player.AttributeMax.LUK");
	}

	public static int getMaxCon(){
		return config.getInt("Player.AttributeMax.CON");
	}

	public static int getMaxWis(){
		return config.getInt("Player.AttributeMax.WIS");
	}
}
