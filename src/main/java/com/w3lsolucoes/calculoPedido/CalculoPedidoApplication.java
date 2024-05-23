package com.w3lsolucoes.calculoPedido;

import com.w3lsolucoes.calculoPedido.model.Order;
import com.w3lsolucoes.calculoPedido.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
public class CalculoPedidoApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(CalculoPedidoApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {


		Scanner scanner = new Scanner(System.in);
		System.out.print("Codigo do Pedido: ");
		int code = scanner.nextInt();
		System.out.print("Valor do Pedido: ");
		double  basic = scanner.nextDouble();
		System.out.print("valor do desconto: ");
		double discount = scanner.nextDouble();

		Order order = new Order(code,basic,discount);
		System.out.println(	"Pedido N.: " + order.getCode() +
							"\nValor R$: " +order.getBasic() +
							"\nDesconto R$: " + order.getDiscount() +
							"\nValor Final + Frete R$: " + orderService.total(order));


	}
}
