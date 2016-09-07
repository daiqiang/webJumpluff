import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jumpluff.capture.model.OssFileRelateMan;
import com.jumpluff.capture.model.User;
import com.jumpluff.capture.service.IOssFileRelateManService;
import com.jumpluff.capture.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);
	
	@Resource
	private IOssFileRelateManService ossFileRelateManService;
	@Resource
	private IUserService UserServiceImpl;
	
	@Test
	public void test1() {
		OssFileRelateMan record = new OssFileRelateMan();
		record.setRelateid(12);
		record.setRelatemanname("测试12");
		ossFileRelateManService.insert(record);
	}
	
	@Test
	public void test2(){
		User user = new User();
		user.setName("娜美");
		UserServiceImpl.insert(user);
	}
}
