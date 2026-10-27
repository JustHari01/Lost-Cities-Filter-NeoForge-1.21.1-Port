package com.lostcities.logfilter;

import net.neoforged.fml.common.Mod;

@Mod(LostCitiesFilterMod.MOD_ID)
public final class LostCitiesFilterMod {
    public static final String MOD_ID = "logfilter";

    public LostCitiesFilterMod() {
        LogMessageFilter.install();
    }
}
