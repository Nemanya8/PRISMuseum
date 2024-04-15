package com.muzej.pris;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.muzej.pris.repository.WikiRepository;

@SpringBootTest
class PrisMuzejWikiApplicationTests {

	@Autowired
	WikiRepository wr;
	
	@Test
	void returnsAll() throws Exception {
		assertThat(wr.findAll()).isNotNull();
	}
	
	@Test
	void returnsByTitle1() throws Exception {
		String title = "Romantizam";
		assertThat(wr.findByTitle(title).isPresent()).isTrue();
	}

	@Test
	void returnsByTitle2() throws Exception {
		String title = "Romantizam";
		assertThat(wr.findByTitle(title).isEmpty()).isFalse();
	}
}
