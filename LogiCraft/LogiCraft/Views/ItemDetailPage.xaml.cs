using LogiCraft.ViewModels;
using System.ComponentModel;
using Xamarin.Forms;

namespace LogiCraft.Views
{
    public partial class ItemDetailPage : ContentPage
    {
        public ItemDetailPage()
        {
            InitializeComponent();
            BindingContext = new ItemDetailViewModel();
        }
    }
}