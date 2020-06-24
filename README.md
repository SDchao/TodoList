# TODO-LIST 类规范
## 格式说明
### 成员
* 类型 变量名 [具有get方法] [具有set方法] 含义
### 方法
* 返回值类型 方法名([参数1类型] [参数1] [,...]) 含义
## Event类
待办事项的信息类
### 成员
* String title get set 标题
* String content get set 内容
* Boolean isCompleted get set 是否完成
## Manager类
待办事项的管理类
### 方法
* ArrayList<Event> getEvents() 用于获取所有时间的list
* void addEvent(Event e) 用于添加事件的方法，参数为欲添加的事件
* void removeEvent(int index) 用于删除事件的方法，参数为欲删除的事件索引
* void setComplete(int index, Boolean isCompleted) 用于将事件设置为完成，参数1为欲设置的事件索引，参数2为完成状态
* void modifyEvent(int index, string newTitle, string newContent) 用于修改事件，参数1为欲修改的事件索引，参数2为新标题，参数3
                                                                    为新内容