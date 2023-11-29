package com.javacosmos;

import com.javacosmos.dao.CosmosClientFactory;
import com.javacosmos.dao.DocDbDao;
import com.javacosmos.dao.TodoDao;
import com.javacosmos.model.TodoItem;
;

import java.util.List;
import java.util.UUID;

public class JavaCosmosPocApplication {


	public static void main(String[] args) {
		try {
			//CosmosClientFactory cosmosClientFactory = new CosmosClientFactory();
			//cosmosClientFactory.getCosmosClient();

			TodoDao todoDao = new DocDbDao();

			TodoItem todoItem = new TodoItem();

			todoItem.setName("Guna Ponnuswami");
			todoItem.setCategory("Sr Angular Developer");
			todoItem.setComplete(true);
			todoItem.setId(UUID.randomUUID().toString());

			todoDao.createTodoItem(todoItem);


		//public boolean deleteTodoItem(@NonNull String id) {
			 boolean value=todoDao.deleteTodoItem("e515a96b-1c48-45aa-b88f-c5ba0bfc4962");
		//}

		//public TodoItem getTodoItemById(@NonNull String id) {
			TodoItem todoitem=todoDao.readTodoItem("64739c8c-5ea5-4b3d-8368-e42a338fe103");
			//System.out.println(todoitem.getName());
		//}


			List<TodoItem> itemList=todoDao.readTodoItems();
			itemList.forEach(t->{System.out.println("Id : "+t.getId()+" Category : "+t.getCategory()+" Name : "+t.getName());});

		}catch (Exception e){
			e.printStackTrace();
		}
			// todoDao.updateTodoItem(id, true);

	}

}
