package caseStudy.controller;

import caseStudy.repository.*;
import caseStudy.service.interfaces.*;
import caseStudy.view.InputUtil;
import caseStudy.view.Menu;
import caseStudy.view.TicketView;
import caseStudy.view.TripView;

public class MainController {
    private final Menu menu;
    private final TicketController ticketController;
    private final TripController tripController;
    public MainController() {
        TicketRepository ticketRepo = new TicketRepository();
        TripRepository tripRepo = new TripRepository();
        CustomerRepository customerRepo = new CustomerRepository();
        BusRepository busRepo = new BusRepository();
        StationRepository stationRepo = new StationRepository();
        TicketServiceInterface ticketService = new TicketService(ticketRepo, tripRepo, busRepo);
        TripServiceInterface tripService = new TripService(tripRepo, ticketRepo);
        CustomerServiceInterface customerService = new CustomerService(customerRepo);
        BusServiceInterface busService = new BusService(busRepo);
        StationServiceInterface stationService = new StationService(stationRepo);
        this.menu = new Menu();
        TicketView ticketView = new TicketView();
        TripView tripView = new TripView();
        this.tripController = new TripController(tripService, busService, stationService, tripView);
        this.ticketController = new TicketController(ticketService, customerService, tripController, ticketView);
    }
    public void run() {
        while (true) {
            menu.displayMainMenu();
            int choice = InputUtil.readInt("Nhập lựa chọn của bạn: ");
            switch (choice) {
                case 1: ticketController.startBookingFlow(); break;
                case 2: ticketController.startCancellationFlow(); break;
                case 3: tripController.showAllTrips(); break;
                case 4: tripController.showRevenueStatistics(); break;
                case 0: System.out.println("Cảm ơn đã sử dụng hệ thống!"); return;
                default: System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }
}

