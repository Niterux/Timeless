package fr.rader.timeless;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "timeless")
public class TimelessConfig implements ConfigData {

    @Comment(
            "Use the old Create New World menu that\n" +
            "was used prior to 1.19.4."
    )
    public boolean useOldWorldMenu = true;

    @Comment(
            "Reintroduce the hit direction bug that\n" +
            "got fixed in 1.19.4. The fix allows the\n" +
            "player to know the direction they were\n" +
            "hit from. This prevents it."
    )
    public boolean disableHitDirection = true;

    @ConfigEntry.Gui.RequiresRestart()
    @Comment(
            "Use the old window icons that was a" +
            "crafting table.\n"
    )
    public boolean useOldWindowIcons = true;

    @Comment(
            "Pistons emit a \"clunk\" sound and smoke\n" +
            "particles when they can't push a block.\n" +
            "This feature was mentioned in 2016\n" +
            "but never got implemented."
    )
    public boolean doPistonClunk = true;

    @Comment(
            "Skeletons shoot purple arrow like they\n" +
            "used to in Survival Test."
    )
    public boolean skeletonShootPurpleArrow = true;
}
