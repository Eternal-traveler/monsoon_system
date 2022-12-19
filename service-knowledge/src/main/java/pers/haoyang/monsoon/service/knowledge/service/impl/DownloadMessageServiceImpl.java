package pers.haoyang.monsoon.service.knowledge.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import pers.haoyang.monsoon.service.knowledge.dao.DownloadMessageDao;
import pers.haoyang.monsoon.service.knowledge.entity.DownloadMessageEntity;
import pers.haoyang.monsoon.service.knowledge.service.DownloadMessageService;


@Service("downloadMessageService")
public class DownloadMessageServiceImpl extends ServiceImpl<DownloadMessageDao, DownloadMessageEntity> implements DownloadMessageService {


}
