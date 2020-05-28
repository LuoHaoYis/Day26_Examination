package com.lhy.data;




public class HomeBean {
    /**
     * id : 296895
     * uid : 1165965
     * name :
     * title : 小雨来得正是时候
     * excerpt : 年轻人借由自己去写歌、写词，确定自己可以做这件事情，这是很重要的一种对自己的肯定。
     * lead : 这几天，北京罕见地连下了几场雨。阴雨天让人感到郁闷，但也送来了放晴后难得的清朗天气。南方常常下雨，所以有不少借雨抒情的歌曲。今晚与大家分享郑怡的《小雨来得正是时候》专辑同名主打曲。这是李宗盛制作的第一张专辑。四十年间审美变化了不少，我们现在很少能听到如此清亮的嗓音了。这首歌讲一位女孩失恋了，那时正好下了一场雨。郑怡唱出了她的委屈与不甘。
     * model : 3
     * position : 0
     * thumbnail : https://img.owspace.com/Public/uploads/Picture/2020-05-25/5ecb7f989f17d.jpg
     * create_time : 1590413400
     * update_time : 2020/05/25
     * tags : [{"name":""}]
     * status : 1
     * video :
     * fm : http://img.owspace.com/F_olw1067920_1590391658.3609835.mp3
     * link_url :
     * publish_time : 0
     * view : 1.4w
     * share : http://static.owspace.com/wap/296895.html
     * comment : 0
     * good : 14
     * bookmark : 0
     * show_uid : 1165965
     * fm_play : https://img.owspace.com/Public/uploads/Picture/2020-05-25/5ecb7d42d4ea3.jpg
     * lunar_type : 1
     * html5 : http://static.owspace.com/wap/296895.html
     * author : 郑怡
     * tpl : 3
     * avatar : https://img.owspace.com/Public/static/avatar/3.png
     * discover : 0
     * category : TO LISTEN
     * hot_comments : []
     * parseXML : 1
     */

    Long db_id;
    private String id;
    private String uid;
    private String name;
    private String title;
    private String excerpt;
    private String lead;
    private String model;
    private String position;
    private String thumbnail;
    private String create_time;
    private String update_time;
    private String status;
    private String video;
    private String fm;
    private String link_url;
    private String publish_time;
    private String view;
    private String share;
    private String comment;
    private String good;
    private String bookmark;
    private String show_uid;
    private String fm_play;
    private String lunar_type;
    private String html5;
    private String author;
    private int tpl;
    private String avatar;
    private String discover;
    private String category;
    private int parseXML;
    public HomeBean(Long db_id, String id, String uid, String name, String title, String excerpt, String lead, String model, String position, String thumbnail, String create_time,
            String update_time, String status, String video, String fm, String link_url, String publish_time, String view, String share, String comment, String good, String bookmark,
            String show_uid, String fm_play, String lunar_type, String html5, String author, int tpl, String avatar, String discover, String category, int parseXML) {
        this.db_id = db_id;
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.title = title;
        this.excerpt = excerpt;
        this.lead = lead;
        this.model = model;
        this.position = position;
        this.thumbnail = thumbnail;
        this.create_time = create_time;
        this.update_time = update_time;
        this.status = status;
        this.video = video;
        this.fm = fm;
        this.link_url = link_url;
        this.publish_time = publish_time;
        this.view = view;
        this.share = share;
        this.comment = comment;
        this.good = good;
        this.bookmark = bookmark;
        this.show_uid = show_uid;
        this.fm_play = fm_play;
        this.lunar_type = lunar_type;
        this.html5 = html5;
        this.author = author;
        this.tpl = tpl;
        this.avatar = avatar;
        this.discover = discover;
        this.category = category;
        this.parseXML = parseXML;
    }
    public HomeBean() {
    }
    public Long getDb_id() {
        return this.db_id;
    }
    public void setDb_id(Long db_id) {
        this.db_id = db_id;
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUid() {
        return this.uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getExcerpt() {
        return this.excerpt;
    }
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }
    public String getLead() {
        return this.lead;
    }
    public void setLead(String lead) {
        this.lead = lead;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getPosition() {
        return this.position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getCreate_time() {
        return this.create_time;
    }
    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
    public String getUpdate_time() {
        return this.update_time;
    }
    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getVideo() {
        return this.video;
    }
    public void setVideo(String video) {
        this.video = video;
    }
    public String getFm() {
        return this.fm;
    }
    public void setFm(String fm) {
        this.fm = fm;
    }
    public String getLink_url() {
        return this.link_url;
    }
    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }
    public String getPublish_time() {
        return this.publish_time;
    }
    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }
    public String getView() {
        return this.view;
    }
    public void setView(String view) {
        this.view = view;
    }
    public String getShare() {
        return this.share;
    }
    public void setShare(String share) {
        this.share = share;
    }
    public String getComment() {
        return this.comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getGood() {
        return this.good;
    }
    public void setGood(String good) {
        this.good = good;
    }
    public String getBookmark() {
        return this.bookmark;
    }
    public void setBookmark(String bookmark) {
        this.bookmark = bookmark;
    }
    public String getShow_uid() {
        return this.show_uid;
    }
    public void setShow_uid(String show_uid) {
        this.show_uid = show_uid;
    }
    public String getFm_play() {
        return this.fm_play;
    }
    public void setFm_play(String fm_play) {
        this.fm_play = fm_play;
    }
    public String getLunar_type() {
        return this.lunar_type;
    }
    public void setLunar_type(String lunar_type) {
        this.lunar_type = lunar_type;
    }
    public String getHtml5() {
        return this.html5;
    }
    public void setHtml5(String html5) {
        this.html5 = html5;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getTpl() {
        return this.tpl;
    }
    public void setTpl(int tpl) {
        this.tpl = tpl;
    }
    public String getAvatar() {
        return this.avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getDiscover() {
        return this.discover;
    }
    public void setDiscover(String discover) {
        this.discover = discover;
    }
    public String getCategory() {
        return this.category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getParseXML() {
        return this.parseXML;
    }
    public void setParseXML(int parseXML) {
        this.parseXML = parseXML;
    }
}
