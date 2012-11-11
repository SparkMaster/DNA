package DNA.network;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import DNA.lib.Reference;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet250CustomPayload;

public enum PacketTypeHandler {
	KEY(null),
	TILE(null);

	private Class<? extends PacketDNA> clazz;

	PacketTypeHandler(Class<? extends PacketDNA> clazz) {
		this.clazz = clazz;
	}

	public static PacketDNA buildPacket(byte[] data) {
		ByteArrayInputStream bis = new ByteArrayInputStream(data);
		int selector = bis.read();
		DataInputStream dis = new DataInputStream(bis);

		PacketDNA packet = null;

		try {
			packet = values()[selector].clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

		packet.readPopulate(dis);

		return packet;
	}

	public static PacketDNA buildPacket(PacketTypeHandler type) {
		PacketDNA packet = null;

		try {
			packet = values()[type.ordinal()].clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

		return packet;
	}

	public static Packet populatePacket(PacketDNA packetDNA) {
		byte[] data = packetDNA.populate();

		Packet250CustomPayload packet250 = new Packet250CustomPayload();
		packet250.channel = Reference.CHANNEL_NAME;
		packet250.data = data;
		packet250.length = data.length;
		packet250.isChunkDataPacket = packetDNA.isChunkDataPacket;

		return packet250;
	}
}