package sample.maven_sample.logic;

import sample.maven_sample.dto.FirstDto;

public class FirstLogic {

	public static void main(String[] args) {
		FirstDto dto = new FirstDto();
		
		// test Lombok
		dto.setId(12L);
		
		System.out.println(dto.getId());
	}
}
