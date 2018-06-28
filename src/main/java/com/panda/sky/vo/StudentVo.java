package com.panda.sky.vo;

import java.io.Serializable;

/**
 * 测试Vo
 * @author pcongda
 */
public class StudentVo implements Serializable{

	private static final long serialVersionUID = -282184182276194115L;

	private Integer id;
	private String name;
	private Integer age;
	private Double score;

	public StudentVo() {

	}

	public StudentVo(Integer id, String name, Integer age,Double score) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
}
