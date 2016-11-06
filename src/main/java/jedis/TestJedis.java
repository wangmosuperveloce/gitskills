package jedis;

import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by wangmo on 16/9/30.
 */
public class TestJedis {

    private Jedis jedis;

    @Before
    public void setup() {
        jedis = new Jedis("127.0.0.1", 6379);
//        jedis.auth("admin");
    }

    @Test
    public void testString() {
        jedis.set("name","wangmo");
        assertTrue(jedis.get("name").equals("wangmo"));

        jedis.append("name", " is my name");
        System.out.println(jedis.get("name"));

        jedis.del("name");
        assertNull(jedis.get("name"));

        jedis.mset("name", "wangmo", "age", "23", "qq", "1359779277");
        jedis.incr("age");

        assertEquals(jedis.get("name"),"wangmo");
        assertEquals(jedis.get("age"),"24");
        assertEquals(jedis.get("qq"),"1359779277");
    }

    @Test
    public void testMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "xinxin");
        map.put("age", "22");
        map.put("qq", "123456");
        jedis.hmset("user",map);
        List<String> rsmap = jedis.hmget("user","name","age","qq");
        System.out.println(rsmap);
        jedis.hdel("user","age");
        System.out.println(jedis.hmget("user", "age")); //因为删除了，所以返回的是null
        System.out.println(jedis.hlen("user")); //返回key为user的键中存放的值的个数2
        System.out.println(jedis.exists("user"));//是否存在key为user的记录 返回true
        System.out.println(jedis.hkeys("user"));//返回map对象中的所有key
        System.out.println(jedis.hvals("user"));//返回map对象中的所有value

        Iterator<String> iter = jedis.hkeys("user").iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(s + ":" + jedis.hmget("user", s));
        }
    }

    @Test
    public void testList() {
        jedis.del("java framework");
        System.out.println(jedis.lrange("java framework",0,-1));
        jedis.lpush("java framework", "spring");
        jedis.lpush("java framework", "struts");
        jedis.lpush("java framework", "hibernate");
        System.out.println(jedis.lrange("java framework",0,-1));

        jedis.del("java framework");
        jedis.lpush("java framework", "spring");
        jedis.lpush("java framework", "struts");
        jedis.lpush("java framework", "hibernate");
        System.out.println(jedis.lrange("java framework",0,-1));
    }

    @Test
    public void testSet() {
        jedis.del("user");
        jedis.sadd("user", "liuling");
        jedis.sadd("user", "xinxin");
        jedis.sadd("user", "ling");
        jedis.sadd("user", "zhangxinxin");
        jedis.sadd("user", "who");
        jedis.srem("user", "who");
        System.out.println(jedis.smembers("user"));
        System.out.println(jedis.sismember("user", "who"));
        System.out.println(jedis.srandmember("user"));
        System.out.println(jedis.scard("user")); // card means cardinality
    }

    @Test
    public void test() throws InterruptedException {
        jedis.del("a");
        jedis.rpush("a", "1");
        jedis.lpush("a", "6");
        jedis.lpush("a", "3");
        jedis.lpush("a", "9");
        System.out.println(jedis.lrange("a",0,-1));
        System.out.println(jedis.sort("a"));
        System.out.println(jedis.lrange("a",0,-1));
    }

    @Test
    public void testRedisPool() {
        RedisUtil.getJedis().set("newname","中文测试");
        System.out.println(RedisUtil.getJedis().get("newname"));
    }

    @Test
    public void testNaN() {
        float n = 0.0f / 0.0f;

        System.out.println(n==n);

        float t = 1.0f;

        System.out.println(t == t);

        n= 0-n;
        System.out.println("test:"+(n<0f));

        HashMap<String,String> map = new HashMap<>();

//        Class c = map.getClass();
//        java.lang.reflect.Field[] fields = c.getDeclaredFields();
//        for (java.lang.reflect.Field field : fields) {
//            //System.out.println(field.getName());
//            if (field.getName().equals("threshold")) {
//                field.setAccessible(true);
//                try {
//                    int x = (int) field.get(map);
//                    System.out.println(x);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }

    }

}
