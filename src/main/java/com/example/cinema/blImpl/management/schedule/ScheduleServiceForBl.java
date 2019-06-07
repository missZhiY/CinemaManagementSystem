package com.example.cinema.blImpl.management.schedule;

import com.example.cinema.po.ScheduleItem;

import java.util.Date;
import java.util.List;

/**
 * @author fjj
 * @date 2019/4/28 12:30 AM
 */
public interface ScheduleServiceForBl {
    /**
     * 查询所有涉及到movieIdList中电影的排片信息
     * @param movieIdList
     * @return
     */
    List<ScheduleItem> getScheduleByMovieIdList(List<Integer> movieIdList);

    /**
     * 根据id查找排片信息
     * @param id
     * @return
     */
    ScheduleItem getScheduleItemById(int id);

    /**
     * 获取所有已经排片的影厅
     * @return
     */
    List<Integer> getScheduledHalls();

    /**
     * 获取指定日期区间的全部排片
     * @param startDate
     * @param endDate
     * @return
     */
    List<ScheduleItem> getScheduleBetweenDays(Date startDate, Date endDate);
}
