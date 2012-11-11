package DNA.handlers;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import DNA.network.PacketDNA;
import DNA.network.PacketTypeHandler;

import net.minecraft.src.INetworkManager;
import net.minecraft.src.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandler implements IPacketHandler {

	/***
	 * Handles Packet250CustomPayload packets that are registered to an Equivalent Exchange 3 network channel
	 * @param manager The NetworkManager associated with the current platform (client/server)
	 * @param packet The Packet250CustomPayload that was received
	 * @param player The Player associated with the packet
	 */
    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
    	// Build a PacketEE object from the data contained within the Packet250CustomPayload packet
    	PacketDNA packetDNA = PacketTypeHandler.buildPacket(packet.data);
    	
    	// Execute the appropriate actions based on the PacketEE type
    	packetDNA.execute(manager, player);
    }

}