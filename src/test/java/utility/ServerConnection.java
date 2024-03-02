package utility;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ServerConnection {

	static ManagedChannel channel;
	// private final StateAgencyServiceGrpc.StateAgencyServiceBlockingStub
	// blockingStub;

	public static ManagedChannel getServerConnection(String uri) {
		try {
			channel = ManagedChannelBuilder.forTarget(uri).useTransportSecurity().build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return channel;

	}

	public static void shutdown() {
		channel.shutdown();
	}
}
