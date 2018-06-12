package com.joyveb.springboot.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableTransactionManagement // 需要事务的时候加上
@RestController
public class UserController {

	@Autowired
	private UserMapper personMapper;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String test() {
		log.debug("测试日志");
		return "test sprintboot";
	}

	@RequestMapping("/save")
	public Long save() {
		User personDO = new User();
		personDO.setName("920847@qq.com");
		personDO.setName("陈佳");
		log.debug("插入数据");
		personMapper.insert(personDO);
		log.debug("数据插入完成");
		return personDO.getId();
	}

	@RequestMapping("/update")
	public Long update() {
		User personDO = new User();
		personDO.setName("920847@qq.com");
		personDO.setName("陈佳");
		personDO.setId(2L);
		return personMapper.update(personDO);
	}

	@RequestMapping("/delete")
	public Long delete() {
		return personMapper.delete(11L);
	}

	@RequestMapping("/selectById")
	public User selectById() {
		return personMapper.selectById(2L);
	}

	@RequestMapping("/selectAll")
	public List<User> selectAll() {
		return personMapper.selectAll();
	}

	@RequestMapping("/transaction")
	@Transactional // 需要事务的时候加上
	public Boolean transaction() {

		delete();

		int i = 3 / 0;

		save();

		return true;
	}

}
