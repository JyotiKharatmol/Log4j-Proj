package gamma;
import org.apache.logging.log4j.*;


public class Demo2 {

	
	private static Logger log = LogManager.getLogger(Demo2.class.getName());
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		log.fatal("Page is not loading");
		
		log.error("object is not found");
		
		log.debug("pdf downloaded");
		
		log.info("package purchased successfully");
		
	}

}
