package javamongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javamongo.Aluno;
import org.bson.Document;

public class Connection {
    MongoClient cliente = new MongoClient("127.0.0.1",27001);
    MongoDatabase banco = cliente.getDatabase("teste");
    MongoCollection<Document> = banco.getCollection("aluno");
}
