package persistence;

import persistence.crud.BillCrudRepositoy;
import persistence.entity.Bill;

import java.util.List;
import java.util.Optional;

public class BillRepository {
    private BillCrudRepositoy billCrudRepositoy;

    public List<Bill> getAll(){
        return (List<Bill>) billCrudRepositoy.findAll();
    }

    public Optional<Bill> getBillById(int id) {
        return billCrudRepositoy.findById(id);
    }

    public Bill save (Bill bill) {
        return billCrudRepositoy.save(bill);
    }

    public void delete(int id) {
        billCrudRepositoy.deleteById(id);
    }

    public boolean existsProducts(int id) { return billCrudRepositoy.existsById(id); }


    public long countALL() { return billCrudRepositoy.count(); }
}
