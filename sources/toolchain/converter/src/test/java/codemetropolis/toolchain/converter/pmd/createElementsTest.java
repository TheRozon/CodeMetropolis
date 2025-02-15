package codemetropolis.toolchain.converter.pmd;

import static org.junit.Assert.assertTrue;
import java.io.File;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import codemetropolis.toolchain.commons.cdf.CdfTree;
import codemetropolis.toolchain.commons.exceptions.CodeMetropolisException;


public class createElementsTest {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String filePath = new File("").getAbsolutePath();
		PmdConverter c=new PmdConverter(null);
		Document doc=c.loadXml(filePath+"//pom.xml");
		boolean good=true;
		Node n=doc;
		CdfTree tree=null;
		try {
		tree=c.createElements(filePath+"//pom.xml");
		} catch (CodeMetropolisException e) {
			assertTrue(false);
		}
		Assert.assertTrue(tree!=null);
			}

}
