package com.cjy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cjy.domain.BoardVO;

import lombok.extern.java.Log;

@Log
@SpringBootTest
public class LombokTest {
	@Test
	public void test01() { 
		BoardVO vo=new BoardVO();
		log.info("test01 입니다"+vo);
	}
	
	@Test
	public void test02() {
		BoardVO vo=new BoardVO(1, "title1", "content1","user1");
		log.info("test02"+vo);
	}
}
		
		