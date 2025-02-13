package com.ssafy.artmate.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.artmate.dto.FeedDto;
import com.ssafy.artmate.mapper.FeedMapper;
@Service
public class FeedServiceImpl implements FeedService{
	@Autowired
	private SqlSession sqlSession; 
	
	@Override
	public boolean insertFeed(FeedDto feed) {
		if(sqlSession.getMapper(FeedMapper.class).insertFeed(feed)==1) {
			return true;
		}
		return false;
	}

	@Override
	public List<FeedDto> selectAllMyFeed(String userId) {
		return sqlSession.getMapper(FeedMapper.class).selectAllMyFeed(userId);
	}

	@Override
	public List<FeedDto> selectAllNewsFeed(String userId) {
		return sqlSession.getMapper(FeedMapper.class).selectAllNewsFeed(userId);
	}

	@Override
	public FeedDto selectOneFeed(String userId, int id) {
		return sqlSession.getMapper(FeedMapper.class).selectOneFeed(userId, id);
	}

	@Override
	public boolean modifyFeed(FeedDto feed) {
		if(sqlSession.getMapper(FeedMapper.class).modifyFeed(feed)==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteFeed(int id) {
		if(sqlSession.getMapper(FeedMapper.class).deleteFeed(id)==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertBookmark(String userId, int feedId) {
		if(sqlSession.getMapper(FeedMapper.class).insertBookmark(userId,feedId)==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteBookmark(String userId, int feedId) {
		if(sqlSession.getMapper(FeedMapper.class).deleteBookmark(userId,feedId)==1) {
			return true;
		}
		return false;
	}

	@Override
	public List<FeedDto> selectMyBookmark(String userId) {
		return sqlSession.getMapper(FeedMapper.class).selectMyBookmark(userId);
	}

	@Override
	public FeedDto selectOneBookmark(String userId, int feedId) {
		return sqlSession.getMapper(FeedMapper.class).selectOneBookmark(userId, feedId);
	}

	@Override
	public boolean insertLikemark(String userId, int feedId) {
		if(sqlSession.getMapper(FeedMapper.class).insertLikemark(userId,feedId)==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteLikemark(String userId, int feedId) {
		if(sqlSession.getMapper(FeedMapper.class).deleteLikemark(userId,feedId)==1) {
			return true;
		}
		return false;
	}

	@Override
	public FeedDto selectOneLikemark(String userId, int feedId) {
		return sqlSession.getMapper(FeedMapper.class).selectOneLikemark(userId, feedId);
	}

	@Override
	public String selectFeedImg(int id) {
		return sqlSession.getMapper(FeedMapper.class).selectFeedImg(id);
	}

	@Override
	public boolean modifyLikeCnt(FeedDto feed) {
		return sqlSession.getMapper(FeedMapper.class).modifyLikeCnt(feed) == 1;
	}

	@Override
	public boolean modifyFeedImg(FeedDto feed) {
		return sqlSession.getMapper(FeedMapper.class).modifyFeedImg(feed) == 1;
	}

	@Override
	public List<FeedDto> selectAllFeed(String userId) {
		return sqlSession.getMapper(FeedMapper.class).selectAllFeed(userId);
	}

	@Override
	public boolean insertFeedExhibit(String userId, int feedId) {
		return sqlSession.getMapper(FeedMapper.class).insertFeedExhibit(userId, feedId) == 1;
	}

	@Override
	public boolean deleteFeedExhibit(String userId, int feedId) {
		return sqlSession.getMapper(FeedMapper.class).deleteFeedExhibit(userId, feedId) == 1;
	}

	@Override
	public List<FeedDto> selectFeedExhibit(String userId) {
		return sqlSession.getMapper(FeedMapper.class).selectFeedExhibit(userId);
	}

	@Override
	public boolean checkFeedExhibit(String userId, int feedId) {
		return sqlSession.getMapper(FeedMapper.class).checkFeedExhibit(userId, feedId)==0;
	}

	@Override
	public boolean modifyFeedTheme(String userId, int num) {
		return sqlSession.getMapper(FeedMapper.class).modifyFeedTheme(userId, num)==1;
	}

	@Override
	public int selectFeedTheme(String userId) {
		return sqlSession.getMapper(FeedMapper.class).selectFeedTheme(userId);
	}

	@Override
	public List<FeedDto> selectPopularFeed() {
		return sqlSession.getMapper(FeedMapper.class).selectPopularFeed();
	}
}
