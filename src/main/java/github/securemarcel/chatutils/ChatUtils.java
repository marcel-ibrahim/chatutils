package github.securemarcel.chatutils;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class ChatUtils implements ModInitializer {
	private static ChatHud secondChatHud;

	@Override
	public void onInitialize() {
		// Create the second chat window
	}
}
