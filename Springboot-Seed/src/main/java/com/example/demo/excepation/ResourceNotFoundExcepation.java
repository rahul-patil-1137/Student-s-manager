package com.example.demo.excepation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class ResourceNotFoundExcepation extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExcepation(String massage)
	{
		super(massage);
	}

}
