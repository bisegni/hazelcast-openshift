import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class DiscoveryTest {

    public static void main(String[] args) {
        //System.setProperty("kubernetes.master", "https://10.245.1.2");

        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
    }

}
