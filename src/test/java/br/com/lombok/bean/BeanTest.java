package br.com.lombok.bean;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.google.code.beanmatchers.BeanMatchers;

@RunWith(MockitoJUnitRunner.class)
public class BeanTest {

	@Test
	public void test() {
		
		assertThat(TesteBean.class, allOf(BeanMatchers.hasValidGettersAndSetters(), BeanMatchers.hasValidBeanToString()));
		assertThat(TesteBean.class, allOf(BeanMatchers.hasValidBeanEquals(), BeanMatchers.hasValidBeanHashCode()));
		
	}

}
