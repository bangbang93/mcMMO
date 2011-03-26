package com.gmail.nossr50;

public class mcLoadProperties {
	public static Boolean mushrooms, toolsLoseDurabilityFromAbilities, pvpxp, miningrequirespickaxe, woodcuttingrequiresaxe, pvp, eggs, apples, myspawnclearsinventory, cake, music, diamond, glowstone, slowsand, sulphur, netherrack, bones, coal, clay, anvilmessages;
	public static String mcability, mcmmo, mcc, mcrefresh, mcitem, mcgod, stats, mmoedit, ptp, party, myspawn, setmyspawn, whois, invite, accept, clearmyspawn;
	public static int xpGainMultiplier, superBreakerCooldown, gigaDrillBreakerCooldown, treeFellerCooldown, berserkCooldown, serratedStrikeCooldown, skullSplitterCooldown, abilityDurabilityLoss, feathersConsumedByChimaeraWing, pvpxprewardmodifier, repairdiamondlevel, globalxpmodifier, miningxpmodifier, repairxpmodifier, woodcuttingxpmodifier, unarmedxpmodifier, herbalismxpmodifier, excavationxpmodifier, archeryxpmodifier, swordsxpmodifier, axesxpmodifier, acrobaticsxpmodifier;
	
	public static void loadMain(){
    	String propertiesFile = mcMMO.maindirectory + "mcmmo.properties";
    	mcProperties properties = new mcProperties(propertiesFile);
    	properties.load();
    	
    	/*
    	 * COOLDOWN CONTROL
    	 */
    	superBreakerCooldown = properties.getInteger("superBreakerCooldown", 120);
    	gigaDrillBreakerCooldown = properties.getInteger("gigaDrillBreakerCooldown", 120);
    	treeFellerCooldown = properties.getInteger("treeFellerCooldown", 120);
    	berserkCooldown = properties.getInteger("berserkCooldown", 120);
    	serratedStrikeCooldown = properties.getInteger("serratedStrikeCooldown", 120);
    	skullSplitterCooldown = properties.getInteger("skullSplitterCooldown", 120);
    	/*
    	 * OTHER
    	 */
    	myspawnclearsinventory = properties.getBoolean("mySpawnClearsInventory", true);
    	xpGainMultiplier = properties.getInteger("xpGainMultiplier", 1);
    	toolsLoseDurabilityFromAbilities = properties.getBoolean("toolsLoseDurabilityFromAbilities", true);
    	abilityDurabilityLoss = properties.getInteger("abilityDurabilityLoss", 2);
    	feathersConsumedByChimaeraWing = properties.getInteger("feathersConsumedByChimaeraWing", 10);
    	pvpxp = properties.getBoolean("pvpGivesXP", true);
    	pvpxprewardmodifier = properties.getInteger("pvpXpRewardModifier", 1);
    	miningrequirespickaxe = properties.getBoolean("miningRequiresPickaxe", true);
    	woodcuttingrequiresaxe = properties.getBoolean("woodcuttingRequiresAxe", true);
    	repairdiamondlevel = properties.getInteger("repairDiamondLevel", 50);
    	/*
    	 * EXPERIENCE RATE MODIFIER
    	 */
    	globalxpmodifier = properties.getInteger("globalXpModifier", 1);
    	miningxpmodifier = properties.getInteger("miningXpModifier", 2);
    	repairxpmodifier = properties.getInteger("repairXpModifier", 2);
    	woodcuttingxpmodifier = properties.getInteger("woodcuttingXpModifier", 2);
    	unarmedxpmodifier = properties.getInteger("unarmedXpModifier", 2);
    	herbalismxpmodifier = properties.getInteger("herbalismXpModifier", 2);
    	excavationxpmodifier = properties.getInteger("excavationXpModifier", 2);
    	archeryxpmodifier = properties.getInteger("archeryXpModifier", 2);
    	swordsxpmodifier = properties.getInteger("swordsXpModifier", 2);
    	axesxpmodifier = properties.getInteger("axesXpModifier", 2);
    	acrobaticsxpmodifier = properties.getInteger("acrobaticsXpModifier", 2);
    	/*
    	 * TOGGLE CLAY
    	 */
    	clay = properties.getBoolean("gravelToClay", true);
    	/*
    	 * ANVIL MESSAGES
    	 */
    	anvilmessages = properties.getBoolean("anvilMessages", true);
    	/*
    	 * EXCAVATION LOOT TOGGLES
    	 */
    	mushrooms = properties.getBoolean("canExcavateMushrooms", true);
    	glowstone = properties.getBoolean("canExcavateGlowstone", true);
    	pvp = properties.getBoolean("pvp", true);
    	eggs = properties.getBoolean("canExcavateEggs", true);
    	apples = properties.getBoolean("canExcavateApples", true);
    	cake = properties.getBoolean("canExcavateCake", true);
    	music = properties.getBoolean("canExcavateMusic", true);
    	diamond = properties.getBoolean("canExcavateDiamond", true);
    	slowsand = properties.getBoolean("canExcavateSlowSand", true);
    	sulphur = properties.getBoolean("canExcavateSulphur", true);
    	netherrack = properties.getBoolean("canExcavateNetherrack", true);
    	bones = properties.getBoolean("canExcavateBones", true);
    	
    	/*
    	 * CUSTOM COMMANDS
    	 */
    	mcability = properties.getString("/mcability", "mcability");
    	mcrefresh = properties.getString("/mcrefresh", "mcrefresh");
    	mcitem = properties.getString("/mcitem", "mcitem");
    	mcmmo = properties.getString("/mcmmo", "mcmmo");
    	mcc = properties.getString("/mcc", "mcc");
    	mcgod = properties.getString("/mcgod", "mcgod");
    	stats = properties.getString("/stats", "stats");
    	mmoedit = properties.getString("/mmoedit", "mmoedit");
    	ptp = properties.getString("/ptp", "ptp");
    	party = properties.getString("/party", "party");
    	myspawn = properties.getString("/myspawn", "myspawn");
    	setmyspawn = properties.getString("/setmyspawn", "setmyspawn");
    	whois = properties.getString("/whois", "whois");
    	invite = properties.getString("/invite", "invite");
    	accept = properties.getString("/accept", "accept");
    	clearmyspawn = properties.getString("/clearmyspawn", "clearmyspawn");
    	properties.save("==McMMO Configuration==\r\nYou can turn off excavation loot tables by turning the option to false\r\nYou can customize mcMMOs command names by modifying them here as well\r\nThis is an early version of the configuration file, eventually you'll be able to customize messages from mcMMO and XP gains");
    	//herp derp
    }
}