package com.project.stms.task.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.project.stms.command.TaskVO;
import com.project.stms.util.Criteria;

@Mapper
public interface TaskMapper {

	//작업 조회
	public ArrayList<TaskVO> getTaskList(@Param("cri") Criteria cri);
	//데이터 총 개수 구하기
	public int getTotal(@Param("cri") Criteria cri);
	//리스트 삭제
	public int deleteTaskList(int task_id);
	//수정페이지 띄우기(전체 값 입력 되도록)
	public TaskVO getModify(int task_id);
	
	
	
}
