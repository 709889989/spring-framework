package org.springframework.deep.dig;

import org.springframework.stereotype.Service;

/**
 * @author xumingming
 * @version 1.0
 * @date 2023/5/29 14:26
 */
@Service
public class ServiceBean {

	private String hello = "deep dig";

	@Override
	public String toString() {
		return "ServiceBean{" +
				"hello='" + hello + '\'' +
				'}';
	}
}
