package github.securemarcel.chatutils.mixin;

import net.minecraft.client.gui.hud.ChatHud;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ChatHud.class)
public class ModChatHudEditor {
    private static final int MAX_MESSAGES = 5000;
}
