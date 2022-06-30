package com.lan.electronicmall.service.impl;

import com.lan.electronicmall.nosql.mongodb.document.MemberReadHistory;
import com.lan.electronicmall.nosql.mongodb.repository.MemberReadHistoryRepository;
import com.lan.electronicmall.service.MemberReadHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 会员浏览记录管理Service实现类
 */
@Service
public class MemberReadHistoryServiceImpl implements MemberReadHistoryService {
    @Autowired
    private MemberReadHistoryRepository memberReadHistoryRepository;


    //生成浏览记录
    @Override
    public int create(MemberReadHistory memberReadHistory) {
        memberReadHistory.setId(null); //设置id
        memberReadHistory.setCreateTime(new Date()); //设置创造时间
        memberReadHistoryRepository.save(memberReadHistory);
        return 1;  //成功
    }

    //批量删除浏览记录
    @Override
    public int delete(List<String> ids) {
       List<MemberReadHistory> deleteList = new ArrayList<>();
       for(String id:ids){
           MemberReadHistory memberReadHistory = new MemberReadHistory();
           memberReadHistory.setId(id);
           deleteList.add(memberReadHistory);
       }
       memberReadHistoryRepository.deleteAll(deleteList);
       return ids.size();
    }


    //获取用户浏览历史记录
    @Override
    public List<MemberReadHistory> list(Long memberId) {
        return memberReadHistoryRepository.findByMemberIdOrderByCreateTimeDesc(memberId);
    }
}
