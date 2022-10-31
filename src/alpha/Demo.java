package alpha;
import org.apache.logging.log4j.*;


public class Demo {

	
	private static Logger log = LogManager.getLogger(Demo.class.getName());
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		log.fatal("Page is not loading");
		
		log.error("object is not found");
		
		log.debug("pdf downloaded");
		
		log.info("package purchased successfully");
		
	}

}
