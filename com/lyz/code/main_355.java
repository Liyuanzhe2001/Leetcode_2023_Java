package com.lyz.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main_355 {
    class Twitter {

        class Tw {
            // 发送推特用户
            int userId;
            // 发送的tweet内容
            int tweetId;
        }

        List<Tw> tweets;
        Map<Integer, List<Integer>> follow;

        // 初始化
        public Twitter() {
            tweets = new ArrayList<>();
            follow = new HashMap<>();
            for (int i = 1; i <= 500; i++) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                follow.put(i, list);
            }
        }

        // userId创建推文tweetId
        public void postTweet(int userId, int tweetId) {
            Tw tw = new Tw();
            tw.userId = userId;
            tw.tweetId = tweetId;
            tweets.add(tw);
        }

        // 检索用户最近十条推文（自己的和关注的）
        public List<Integer> getNewsFeed(int userId) {
            int cnt = 0;
            int index = tweets.size() - 1;
            List<Integer> res = new ArrayList<>();
            while (index >= 0 && cnt < 10) {
                Tw tw = tweets.get(index);
                if (follow.get(userId).contains(tw.userId)) {
                    res.add(tw.tweetId);
                    cnt++;
                }
                index--;
            }
            return res;
        }

        // 关注
        public void follow(int followerId, int followeeId) {
            List<Integer> list = follow.get(followerId);
            list.add(followeeId);
            follow.put(followerId, list);
        }

        // 取关
        public void unfollow(int followerId, int followeeId) {
            List<Integer> list = follow.get(followerId);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == followeeId) {
                    list.remove(i);
                    break;
                }
            }
            follow.put(followerId, list);
        }
    }
}
