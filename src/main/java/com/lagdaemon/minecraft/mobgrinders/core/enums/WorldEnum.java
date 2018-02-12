package com.lagdaemon.minecraft.mobgrinders.core.enums;

import net.minecraft.util.IStringSerializable;

public class WorldEnum {

	public static enum WorldType implements IStringSerializable {
		OVERWORLD("overworld", 0), NETHER("nether", 1), END("end", 2);

		private int ID;
		private String name;

		private WorldType(String name, int ID) {
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
