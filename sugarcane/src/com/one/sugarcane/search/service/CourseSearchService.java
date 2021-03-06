package com.one.sugarcane.search.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 根据索引搜索课程 并且高亮显示 TODO
 * 
 * @author 秦晓宇
 * @date 2018年5月29日
 * 
 */
@Service
@Transactional(readOnly = false)
public class CourseSearchService {
	public static String pt;

	
	private CourseSearch courseSearch = new CourseSearch();

	public ArrayList<String[]> searchByCourseName(String name) throws Exception {
		pt = "E:\\gitRepository\\sugarcane\\sugarcane\\src\\com\\one\\sugarcane\\search\\dataIndex\\courseIndex";
		return this.courseSearch.search(pt, name);
	}
}
