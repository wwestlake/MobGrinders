package com.lagdaemon.minecraft.mobgrinders.core.enums;

import net.minecraft.util.IStringSerializable;

public class MobEnum {
	public static enum MobType implements IStringSerializable {
		ZOMBIE("zombie", 0), 
		SKELETON("skeleton", 1), 
		SPIDER("spider", 2), 
		CREAPER("creaper", 3);
		

		

		
		private int ID;
		private String name;
		
		private MobType(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}

		@Override
		public String getName() {
			return this.name;
		}

		public int getID() {
			return ID;
		}

		@Override
		public String toString() {
			return getName();
		}		
		
	}
}
