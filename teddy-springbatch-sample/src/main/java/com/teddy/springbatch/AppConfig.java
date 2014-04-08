package com.teddy.springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableBatchProcessing
public class AppConfig {
	/* 처리 내용 
	 * 1. 암호화 된 데이터를 읽어 들인다.
	 * 2. 암호화 된 데이터를 복호화 한다.
	 * 3. 복호화된 데이터가 정상인지를 확인 한다.
	 * 4. 정산 인 경우 pass, 비정상인 경우 다른 암호화 알고리즘을 적용한다.
	 * 5. 2번째 암호화 알고리즘으로 복호화한 데이터가 정상인지를 확인한다.
	 *  
	 */

	
}
